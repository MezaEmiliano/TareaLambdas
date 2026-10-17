Practica: Colecciones y Lambdas en Java

DESCRIPCION
Practica de Java con 2 clases de metodos estaticos que manipulan colecciones usando lambdas y streams. La clase ManejoNumeros tiene los metodos que trabajan con numeros y la clase ManejoTextos tiene los que trabajan con cadenas. La clase Main demuestra los 10 metodos con casos normales y casos extremos (listas vacias y valores nulos).

METODOS

1. multiplicarArrayList (ManejoNumeros): multiplica cada numero de un ArrayList por un factor usando replaceAll().

2. filtroSelectivo (ManejoTextos): elimina con removeIf() las cadenas que empiezan con una letra dada (char) o que tienen menos de N caracteres. Tambien quita los elementos nulos.

3. conversorMayusculas (ManejoTextos): convierte las palabras a mayusculas con Stream y map() y regresa una lista nueva. Los elementos nulos se saltan.

4. cuadradosUnicos (ManejoNumeros): regresa un HashSet con los cuadrados de los numeros pares sin repetir.

5. mapaLongitudes (ManejoTextos): crea un HashMap donde la clave es la palabra y el valor es su longitud, usando Collectors.toMap(). Si una palabra se repite, se queda con la primera.

6. modificadorInventario (ManejoNumeros): imprime un catalogo de productos con 10% de descuento usando forEach(). El mapa original no se modifica.

7. contadorFrecuencias (ManejoTextos): cuenta cuantas veces aparece cada palabra usando merge().

8. clasificadorPalabras (ManejoTextos): guarda en un ArrayList las palabras con frecuencia menor a un valor dado usando entrySet().stream(). No modifica el mapa original.

9. deduplicacionPalabras (ManejoTextos): quita los signos de puntuacion de una frase, la divide en palabras, filtra las cortas, las pasa a minusculas y las guarda en un HashSet.

10. topeFrecuencias (ManejoNumeros): limita las frecuencias de un HashMap a un maximo de N usando replaceAll().


EJEMPLO DE COMPILACION Y SALIDA

Metodo 1: El Multiplicador
La lista original es [1, 2, 3, 4, 5]
Multiplicada por 3 queda asi: [3, 6, 9, 12, 15]
Ahora por -2: [-6, -12, -18, -24, -30]
Y por 0: [0, 0, 0, 0, 0]
Con una lista vacia sigue igual: []
Con una lista nula no truena el programa

Metodo 2: El Filtro Selectivo
Profesiones: [medico, ingeniero, maestro, abogado, chef, piloto, mecanico, arquitecto]
Quitando las que empiezan con m o tienen menos de 6 letras: [ingeniero, abogado, piloto, arquitecto]
Lista con un nulo, quitando las que empiezan con a: [casa]
Con la lista vacia: []
Con la lista nula tampoco hay error

Metodo 3: Conversor de Mayusculas
Palabras originales: [perro, gato, raton]
Lista nueva en mayusculas: [PERRO, GATO, RATON]
La original no cambio: [perro, gato, raton]
Lista con un nulo: [perro, null, gato]
Convertida (el nulo se salta): [PERRO, GATO]
Con lista vacia regresa: []
Con lista nula regresa: []

Metodo 4: Cuadrados Unicos
Numeros con repetidos: [1, 2, 2, 3, 4, 4, 6, 7]
Cuadrados de los pares sin repetir: [16, 4, 36]
Con negativos [-4, -2, 2, 3, -3]: [16, 4]
Si solo hay impares (1, 3, 5): []
Con lista vacia: []
Con lista nula: []

Metodo 5: Mapa de Longitudes
Colores: [rojo, azul, verde, amarillo, rojo]
Cada color con su longitud: {verde=5, amarillo=8, azul=4, rojo=4}
Con lista vacia: {}
Con lista nula: {}

Metodo 6: Modificador de Inventario
Catalogo con 10% de descuento:
Laptop cuesta $15000.0, con descuento queda en $13500.0
Mouse cuesta $250.0, con descuento queda en $225.0
Teclado cuesta $800.0, con descuento queda en $720.0
El inventario original no cambio: {Laptop=15000.0, Mouse=250.0, Teclado=800.0}
Catalogo vacio (no imprime productos):
Con catalogo nulo no hay error

Metodo 7: Contador de Frecuencias
Deportes: [futbol, beisbol, futbol, tenis, beisbol, futbol, natacion]
Cuantas veces sale cada uno: {natacion=1, tenis=1, beisbol=2, futbol=3}
Con muchas repeticiones [si, si, si, si, si, no, si, si, no, si]: {no=2, si=8}
Con lista vacia: {}
Con lista nula: {}

Metodo 8: Clasificador de Palabras
Palabras con sus frecuencias: {sol=8, casa=5, arbol=1, rio=2}
Las que salen menos de 3 veces: [arbol, rio]
Las que salen menos de 1 vez (ninguna): []
El mapa original no cambio: {sol=8, casa=5, arbol=1, rio=2}
Con mapa vacio: []
Con mapa nulo: []

Metodo 9: Deduplicacion de Palabras
Frase: Estudiar Java es divertido, y estudiar con calma es mejor que estudiar con prisa.
Palabras de 5 letras o mas sin repetir: [estudiar, divertido, calma, mejor, prisa]
Con frase vacia: []
Con puros signos: []
Con frase nula: []

Metodo 10: El Tope de Frecuencias
Frecuencias originales: {a=10, b=3, c=7}
Con tope de 5 quedan asi: {a=5, b=3, c=5}
Con mapa vacio: {}
Con mapa nulo no hay error

Process finished with exit code 0

