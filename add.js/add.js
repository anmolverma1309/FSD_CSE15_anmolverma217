//    let num1 = prompt("enter the number");
// let num2 = prompt ("enter the second number");
//    let sum = parseFloat(num1) + parseFloat(num2);
//     console.log(sum);


    // temperature converter 1. addition of no's
//write a javascript program for temperature converter3.  write a javascript program to check palindrome no. 
//  write a javascript program to check Armstrong no.
// fibonacci
// binary to decimal and vice versa

    // let choice = prompt("Convert: 1 for C to F, 2 for F to C");
    // let temp = parseFloat(prompt("Enter temperature:"));

    // let result;
    // if (choice === "1") {
    //     result = (temp * 1.8) + 32;
    //     console.log(`${temp}°C = ${result}°F`);
    // } else if (choice === "2") {
    //     result = (temp - 32) * (5/9);
    //     console.log(`${temp}°F = ${result}°C`);
    // } else {
    //     console.log("Invalid choice");
    // }


//     let num = prompt("Enter a number:");
// let numStr = num.toString();
// let isPalindrome = true;

// for (let i = 0; i < numStr.length / 2; i++) {
//     if (numStr[i] !== numStr[numStr.length - 1 - i]) {
//         isPalindrome = false;
//         break;
//     }
// }

// console.log(num + (isPalindrome ? " is a palindrome" : " is not a palindrome"));


// arms
// let number = prompt("Enter a number:");
// let temp = number;
// let sum = 0;
// let numDigits = number.toString().length;

// while (temp > 0) {
//     let digit = temp % 10;
//     sum += Math.pow(digit, numDigits);
//     temp = parseInt(temp / 10);
// }

// console.log(number + (sum === parseInt(number) ? " is an Armstrong number." : " is not an Armstrong number."));


//fibo
// let n = parseInt(prompt("Enter number of terms:"));
// let n1 = 0, n2 = 1, nextTerm;

// console.log("Fibonacci Series:");
// console.log(n1);
// if (n >= 2) console.log(n2);

// for (let i = 3; i <= n; i++) {
//     nextTerm = n1 + n2;
//     console.log(nextTerm);
//     n1 = n2;
//     n2 = nextTerm;
// }


// binary
// let choice = prompt("1: Binary to Decimal, 2: Decimal to Binary");
// let input;

// if (choice === "1") {
//     input = prompt("Enter binary number:");
//     let decimal = parseInt(input, 2);
//     console.log("Decimal:", decimal);
// } else if (choice === "2") {
//     input = parseInt(prompt("Enter decimal number:"));
//     let binary = input.toString(2);
//     console.log("Binary:", binary);
// } else {
//     console.log("Invalid choice.");
// }
// ques should be in the form of function and should be called in the end of the code.