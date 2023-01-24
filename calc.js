const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.question('Enter the first number: ', (number1) => {
  rl.question('Enter the second number: ', (number2) => {
      rl.question('Enter the operation (1 for addition(+), 2 for subtraction(-), 3 for multiplication(*), 4 for distribution(/)', (number3) => {
    let x = parseInt(number1);
    let y = parseInt(number2);
    let z = parseInt(number3);
    
    if (z == 1){
        console.log(`The outputs numbers is ${x + y}`);
    } else if (z == 2){
        console.log(`The outputs numbers is ${x - y}`);
    } else if (z == 3){
        console.log(`The outputs numbers is ${x * y}`);
    } else if (z == 4){
        console.log(`The outputs numbers is ${x / y}`);
    } else if (z == 5){
        console.log(`The outputs numbers is ${y + x}`);
    } else if (z == 6){
        console.log(`The outputs numbers is ${y - x}`);
    } else if (z == 7){
        console.log(`The outputs numbers is ${y * x}`);
    } else if (z == 8){
        console.log(`The outputs numbers is ${y / x}`);
    } else {
        console.log('ERROR UNKNOWN NUMBER YOUR COMPUTER WİLL EXPLODE İN 3 SECONDS');
        console.log('1');
        console.log('2');
        console.log('3');
        console.log('BOOM');
    }
      rl.close();
     });
   });
});
