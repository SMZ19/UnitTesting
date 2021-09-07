const { expect } = require('@jest/globals')
const adds = require('./additionOf')
const x = 5;
const y = 2

test('Adds two numbers',()=>{
    expect(adds(x,y)).toBe(7);
})
test('x greater than y',()=>{
    expect(x).toBeGreaterThan(y);
})
test('y less than x',()=>{
    expect(y).toBeLessThan(x);
})
test('Adds two floating point numbers',()=>{
    expect(adds(1.7,1.2)).toBeCloseTo(2.8995);
})