// Factorial: 5! = 5 x 4 x 3 x 2 x 1
function factorial(n) {
  let result = 1;
  for (let i = 2; i <= n; i++) {
    result *= i;
  }
  return result;
}

// Prime check: only divisible by 1 and itself
function isPrime(n) {
  if (n < 2) return false;
  for (let i = 2; i * i <= n; i++) {
    if (n % i === 0) return false;
  }
  return true;
}

// Fibonacci: each number is the sum of the two before it
function fibonacci(terms) {
  const sequence = [];
  let a = 0, b = 1;
  for (let i = 0; i < terms; i++) {
    sequence.push(a);
    [a, b] = [b, a + b];
  }
  return sequence;
}

// Test
console.log(factorial(5));   // 120
console.log(isPrime(7));     // true
console.log(isPrime(10));    // false
console.log(fibonacci(8));   // [ 0, 1, 1, 2, 3, 5, 8, 13 ]