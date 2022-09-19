
function mdc(a, b) {
    if (a == 0)
        return b;
    return mdc(b % a, a);
}


function acharMDC(array, n) {
    let result = array[0];
    for (let i = 1; i < n; i++) {
        result = mdc(array[i], result);

        if (result == 1) {
            return 1;
        }
    }
    return result;
}

let array = [9, 18, 27, 81, 99];
// ↑ exemplo de array que vai servir de parametro
let n = array.length;
console.log(acharMDC(array, n));