// Reverse a string
function reverseString(str) {
  return str.split("").reverse().join("");
}

// Count characters in a string
function countCharacters(str) {
  return str.length;
}

// Capitalize the first letter of each word
function capitalizeWords(sentence) {
  return sentence
    .split(" ")
    .map(word => word.charAt(0).toUpperCase() + word.slice(1))
    .join(" ");
}

// Test
console.log(reverseString("hello"));            // olleh
console.log(countCharacters("hello world"));    // 11
console.log(capitalizeWords("hello big world")); // Hello Big World