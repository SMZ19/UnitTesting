const { expect } = require('@jest/globals');
const organizeStrAphbly = require('./organizeStrAphbly');
const concatArrays = require('./concatArrays');
const list1 = ["Burrito","Montaña"];
const list2= ["Volar","Noche","Aguila"];

test('First element in array contains letter A',()=>{
    const organizedArray = organizeStrAphbly(list2)
    expect(organizedArray[0]).toMatch(/A/);
})

test('Array contains an element',()=>{
    expect(concatArrays(list1,list2)).toContain("Noche");
})