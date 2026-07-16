// Last updated: 2026. 7. 16. 오전 11:25:18
func convertTime(current string, correct string) int {
	between := convertMinute(correct) - convertMinute(current)

	result := 0
	result += between / 60
	between %= 60
	result += between / 15
	between %= 15
	result += between / 5
	between %= 5
	result += between / 1

	return result
}

func convertMinute(hhmm string) int {
	hourMinutes := convertDigit(hhmm[0:2]) * 60
	minutes := convertDigit(hhmm[3:5]) * 1
	return hourMinutes + minutes
}

func convertDigit(num string) int {
	result := 0
	for i := 0; i < len(num); i++ {
		result = result*10 + convertDigitOne(num[i])
	}
	return result
}

func convertDigitOne(b byte) int {
	if b == '1' {
		return 1
	} else if b == '2' {
		return 2
	} else if b == '3' {
		return 3
	} else if b == '4' {
		return 4
	} else if b == '5' {
		return 5
	} else if b == '6' {
		return 6
	} else if b == '7' {
		return 7
	} else if b == '8' {
		return 8
	} else if b == '9' {
		return 9
	} else {
		return 0
	}
}