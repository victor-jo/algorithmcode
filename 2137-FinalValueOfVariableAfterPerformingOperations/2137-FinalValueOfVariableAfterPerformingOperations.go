// Last updated: 2026. 7. 16. 오전 11:25:27
func finalValueAfterOperations(operations []string) int {
	operationMap := make(map[string]int)
	
	operationMap["++X"] = 1
	operationMap["X++"] = 1
	operationMap["--X"] = -1
	operationMap["X--"] = -1
	
	result := 0
	
	for _, operation := range operations {
		result += operationMap[operation]
	}
	
	return result
}
