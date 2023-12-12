// let harina = '2';
// let mlDeLeche = 250;
// let huevos = 2;
// let cucharadasMantequilla = 2;
// let nutella = 'Sí';

// let tazasDeHarina = parseInt(harina);
// console.log(tazasDeHarina);

// *De numero a cadena*
let cantidadHarina = 200;
let cantidadHarinaStr = String(cantidadHarina);
document.write("Cantidad de harina: " + cantidadHarinaStr + " gramos" +"<br>");

// *De cadena a número*
let cantidadAzucarStr = "50";
let cantidadAzucar = Number(cantidadAzucarStr);
document.write("Cantidad de azúcar: " + cantidadAzucar + " gramos"+"<br>");

// *De booleano a cadena*
let tieneHuevos = true;
let tieneHuevosStr = String(tieneHuevos);
document.write("¿Tiene huevos? " + tieneHuevosStr+"<br>");

// *De cadena a booleano*
let tieneLecheStr = "true";
let tieneLeche = Boolean(tieneLecheStr);
document.write("¿Tiene leche? " + tieneLeche+"<br>");

// *De número a booleano*
let temperaturaSarten = 180;
let temperaturaSartenBool = Boolean(temperaturaSarten);
document.write("¿La sartén está caliente? " + temperaturaSartenBool+"<br>");

// *De booleano a número*
let requiereAceite = false;
let requiereAceiteNum = Number(requiereAceite);
document.write("¿Requiere aceite? " + requiereAceiteNum+"<br>");




var instrucciones = [
    "1. En un tazón grande, mezcla la harina, el azúcar, el polvo de hornear y la sal.",
    "2. Agrega el huevo, la leche y la mantequilla.",
    "3. Mezcla bien hasta obtener una masa suave.",
    "4. Calienta un sartén a fuego medio.",
    "5. Vierte un poco de masa en la sartén caliente para formar cada hotcake.",
    "6. Cocina hasta que aparezcan burbujas en la superficie, luego voltea y cocina el otro lado hasta que esté dorado.",
    "7. Repite el proceso hasta que cocines todos los hotcakes.",
    "8. Sirve caliente con tu jarabe o frutas favoritas.",
];

console.log("\nInstrucciones:");
for (var j = 0; j < instrucciones.length; j++) {
document.write(instrucciones[j]);
}



