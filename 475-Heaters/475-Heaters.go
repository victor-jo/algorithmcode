// Last updated: 2026. 7. 16. 오전 11:26:48
import (
	"math"
)

func findRadius(houses []int, heaters []int) int {
	max := 0
	for _, house := range houses {
		min := math.MaxInt32
		for _, heater := range heaters {
			diff := house - heater
			if diff < 0 {
				diff = -diff
			}
			if diff < min {
				min = diff
			}
		}
		if min > max {
			max = min
		}
	}
	return max
}