# The-substructure-of-a-tree-

输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）

使用递归方法，注意一点，如果当前满足条件，则下面必须连着满足条件，或者从新开始匹配条件。


# 二叉搜索树的后序遍历序列   VerifySquenceOfBST

输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。

注意点：从前往后找，先找刚刚大于最后一个点的位置，从后面找，如果有小于最后一个位置的数，就返回false；
接着递归刚刚找到的位置前面的，后面的。
递归终止条件为 low>=high。

# 复杂链表的复制  Clone

输入一个复杂链表（每个节点中有节点值，以及两个指针，一个指向下一个节点，另一个特殊指针指向任意一个节点），返回结果为复制后复杂链表的head。（注意，输出结果中请不要返回参数中的节点引用，否则判题程序会直接返回空）

解法：每个结点复制一份，接到自己的后面，然后复制random结点，最后将长的链表断开，每隔一个连在一起。
