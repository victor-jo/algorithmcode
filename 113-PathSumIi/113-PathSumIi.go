// Last updated: 2026. 7. 16. 오전 11:27:59
/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */
var result [][]int

func pathSum(root *TreeNode, targetSum int) [][]int {
	result = make([][]int, 0)
	checkSum([]int{}, root, targetSum)
	return result
}

func checkSum(values []int, node *TreeNode, targetSum int) {
	if node == nil {
		return
	}

	values = append(values, node.Val)
	targetSum -= node.Val

	if targetSum == 0 && node.Left == nil && node.Right == nil {
		clone := make([]int, len(values))
		copy(clone, values)
		result = append(result, clone)
	} else {
		checkSum(values, node.Right, targetSum)
		checkSum(values, node.Left, targetSum)
	}
}