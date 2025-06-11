let miPromesa = new Promise( (resolver, rechazar) => { //creamos el objeto de tipo promesa, con dos parámetros callback
    let expresion = false;
    if(expresion){
        resolver('Resolvió correctamente'); //cuando termina bien/si es verdadera la expresión
    }else {
        rechazar('Se produjo un error'); //cuando ocurre un error/ si es falsa
    }
});

miPromesa.then(
    valor => console.log(valor), //función callback para cuando se resuelve
    error => console.log(error) //función callback para cuando se rechaza
);