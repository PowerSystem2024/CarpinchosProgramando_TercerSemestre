let miPromesa = new Promise( (resolver, rechazar) => { //creamos el objeto de tipo promesa, con dos parámetros callback
    let expresion = true;
    if(expresion){
        //resolver('Resolvió correctamente'); //cuando termina bien/si es verdadera la expresión
    }else {
        //rechazar('Se produjo un error'); //cuando ocurre un error/ si es falsa
    }
});

//miPromesa.then(
    //valor => console.log(valor), //función callback para cuando se resuelve
   // error => console.log(error) //función callback para cuando se rechaza
//);

//miPromesa
//    .then( valor => console.log(valor))
//    .catch(error => console.log(error));

let promesa = new Promise((Resolver) => {
    //console.log('Inicio promesa');
    setTimeout( () => Resolver('Saludos desde promesa, callback, función flecha y setTimeout'),3000)
    //console.log('Final promesa');
});

//llamado a la promesa
//promesa.then( valor => console.log(valor));

//async indica que una función regresa una promesa
async function miFuncionConPromesa(){
    return 'Saludos con promesas y async'; //como si llamáramos a la función resolver
}

//miFuncionConPromesa().then(valor => console.log(valor));

//async/await

async function funcionConPromesaYAwait(){
    let miPromesa = new Promise(resolver => {
        resolver('Promesa con await')
    });
    console.log(await miPromesa);
}
//funcionConPromesaYAwait();
    
//Await sólo se puede usar en una función declarada con async

//Promesas, await, async y setTimeout
async function funcionConPromesaAwaitTimeout(){
    let miPromesa = new Promise(resolver => {
        console.log('Inicio función');
        setTimeout(()=> resolver('Promesa con await y Timeout'), 3000);
        console.log('Final función');
    });
    console.log(await miPromesa);
}

//llamamos a la función
funcionConPromesaAwaitTimeout();