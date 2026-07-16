// Last updated: 2026. 7. 16. 오전 11:24:59
type FrequencyTracker struct {
	frequency      []int
	frequencyCount []int
}

func Constructor() FrequencyTracker {
	frequency := make([]int, 100001)
	frequencyCount := make([]int, 100001)
	return FrequencyTracker{
		frequency:      frequency,
		frequencyCount: frequencyCount,
	}
}

func (this *FrequencyTracker) Add(number int) {
	o := this.frequency[number]
	n := o + 1

	if o > 0 {
		this.frequencyCount[o]--
	}

	this.frequency[number] = n
	this.frequencyCount[n]++
}

func (this *FrequencyTracker) DeleteOne(number int) {
	o := this.frequency[number]
	n := o - 1

    if n < 0 {
		return
	}

	if n > 0 {
		this.frequencyCount[n]++
	}

	this.frequency[number] = n
	this.frequencyCount[o]--
}

func (this *FrequencyTracker) HasFrequency(frequency int) bool {
	return this.frequencyCount[frequency] > 0
}