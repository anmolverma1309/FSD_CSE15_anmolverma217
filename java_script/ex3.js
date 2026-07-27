const num = [1,2,3,4,5,6,7,8];
const even = num.filter((n) => n % 2 === 0);
console.log(even); // Output: [2, 4, 6, 8]\
const square = num.map((n) => n * n);
console.log(square);
const sum = square.reduce((acc, curr) => (acc + curr));
console.log(sum);