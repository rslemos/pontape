#!/bin/sh

{
  echo 'graph gitrepo {'
  echo '  rankdir="RL";'
  echo '  node [shape=circle, style=filled, fillcolor=black, width=0.15, fixedsize=true, label=""];'
  echo '  edge [penwidth=3, color=black];'
  git rev-list $(git for-each-ref --format='%(refname)' refs/heads) --parents |
    awk '{
      c=$1;
      for (i=2; i<=NF; i++) {
        printf("  \"%s\" -- \"%s\";\n", c, $i);
      }
    }'
  echo '  { rank=min;'
  git rev-list $(git for-each-ref --format='%(refname)' refs/heads) --max-parents=0 | sed -e 's,.*,"&";,'g
  echo '  }'
  git for-each-ref --format='  "%(objectname)" [xlabel="%(refname:short)"];' refs/heads
  echo '}'
}
