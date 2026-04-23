const prompt = require('prompt-sync')()

const frutas = ['amora']

var fruta = 'c'
while(fruta.length > 0){
fruta = prompt('Digite o nome de uma fruta: ');
frutas.push(fruta)
}
frutas.pop()
console.log(frutas)
