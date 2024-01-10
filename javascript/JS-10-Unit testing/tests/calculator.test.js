/*
*const sum = require('./sum');

test('adds 1 + 2 to equal 3', () => {
expect(sum(1, 2)).toBe(3);
});
 */

const calculator =require(`../modules/calculator`);

//Primer test para la suma
test(`La suma de dos numeros y el valor resultante`, () => {
    expect(calculator.sum(10, 20)).toBe (30);

});

test(`La resta de dos numeros y el valor resultante`, () => {
    expect(calculator.substract(10, 20)).toBe (-10);

});