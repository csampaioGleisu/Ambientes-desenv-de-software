function quicksort(array){
 if(array.length ===0) return [];
 if(array.length ===1) return array;


const pivo = array[array.length -1];
const MenorQuePivo = []
const MaiorQuePivo = []
for(let i = 0; i < array.length - 1; i++){
    if(array[i] < pivo){
        MenorQuePivo.push(array[i]);
    } else {
        MaiorQuePivo.push(array[i]);
    }
}
if(MenorQuePivo.length > 0 && MaiorQuePivo.length > 0){
return [...quicksort(MenorQuePivo), pivo, ...quicksort(MaiorQuePivo)];
} else if (MenorQuePivo.length > 0){
    return [...quicksort(MenorQuePivo), pivo];
} else{
    return [pivo, ...quicksort(MaiorQuePivo)];
}
}
const  numeros= [15,99,12,37,53,98,02,09,01,09];
console.log(quicksort(numeros));

