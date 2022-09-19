function numeroprimo(num) {
    for (var divisor = 2; divisor < num; divisor++) 
    if (num % divisor == 0) return false;
    return true;
}

// ↓ pra dar um fim na repetição do código.Irá mostras todos os primos até o número desejado.
var NúmeroMax = 120;

for (var i = 2; i < NúmeroMax; i++) if (numeroprimo(i)) console.log(i);