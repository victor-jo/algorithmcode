// Last updated: 2026. 7. 16. 오전 11:26:03
func addToArrayForm(num []int, k int) []int {
    i := len(num) - 1

    for k > 0 {
        sum := num[i] + k
        num[i] = sum % 10
        k = sum / 10

        if i == 0 && k > 0 {
            num = append([]int{0}, num...)
            i++
        }

        i--
    }

    return num
}