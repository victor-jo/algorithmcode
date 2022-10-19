function merge(intervals: number[][]): number[][] {
  intervals.sort((a: number[], b: number[]): number => a[0] - b[0]);
  
  let arr : number[][] = [];
  let top : number = -1;
  
  intervals.forEach(interval => {
      if (top == -1 || arr[top][1] < interval[0]) {
          arr[++top] = interval;
      }
      else {
          arr[top] = [arr[top][0], Math.max(arr[top][1], interval[1])];
      }
  });
  
  return arr;
};