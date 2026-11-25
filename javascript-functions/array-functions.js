// Find the biggest number
function findMax(arr) {
  return Math.max(...arr);
}

// Find the smallest number
function findMin(arr) {
  return Math.min(...arr);
}

// Add up all numbers
function sumArray(arr) {
  return arr.reduce((total, num) => total + num, 0);
}

// Keep only items that pass the condition
function filterArray(arr, condition) {
  return arr.filter(condition);
}

// Test
const numbers = [3, 9, 2, 7];
console.log(findMax(numbers));                 // 9
console.log(findMin(numbers));                 // 2
console.log(sumArray(numbers));                // 21
console.log(filterArray(numbers, n => n > 4)); // [ 9, 7 ]