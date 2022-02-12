## Recursion
1. Recurrence Relation:  A recurrence relation is an equation that recursively defines a sequence where the next term is a function of the previous terms.
2. Base case: This is where recursion halts

## Permutation
several possible variations in which a set of numbers or letters can be arranged.
1. Find the recurrence relation.
eg: input: ab output: ab, Ab, aB, AB
the recurrence relation will be we choose upper case or lower case letter and move to the next level where we will perform the same operation. This can be repeated to input size of n.
       ab            index = 0
    a       A        index = 1
 ab  aB  Ab  AB      index = 2
2. Find the base case. add the perumtated letters to result for output.
eg: input.length == index
3. TC: branching factor to height: the max branching factor here is uppoer or lower case which is 2 and the height can be n number of input strings so its:  2 to the power n.
SC: order of height of the tree: O(n). n number of stack space is the max that can be used hence O(n)

## Combination
Here instead of a binary tree this can have multiple branches based on the available combination options. So we have to span multiple branches using a loop. Refer dialer pad problem. Rest is mostly same as the explation in permutation.

## Subsets
Include&Exclude Stratergy: we either choose the element to be added to the subset or we exclude it.
Decrese&concur stratergy. Parent operates on complete input but when the control passes to child the input is decreased by index chars . index being level or some counter we keep track of.
1. recurrence relation: include & exclude  + decrease & conqor stratergy.
2. find base case, add/output subsets.
Tc: branching factor to height
SC: order of height of the tree

