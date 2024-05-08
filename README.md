# Caso-Final-Integrador-Final-de-los-Finales

# Ejercicio 1:
  1. b) Debemos establecer la visibilidad más restrictiva (por ejemplo, privada) en los atributos de una clase. Así, cualquier software que utilice nuestro objeto, sólo accederá al estado de los objetos mediante los métodos que le hayamos permitido utilizar.
  2. b) Falso.
  3. b) Herencia.
  4. b) O(1).
  5. b) Falso.

# Ejercicio 2:
  2. Explica las diferencias entre una tabla Hash y un árbol. ¿ Cuándo conviene utilizar cada una de estas estructuras? Justifique su respuesta y analice todas la posibles operaciones a realizar por las estructuras. No redacte el orden tal y como puede ver en los apuntes, razónelo con sus propias palabras y argumentos.

  La diferencia entre una tabla Hash y un arbol es que la tabla Hash se utiliza cuando necesitamos un acceso mas rapido para los datos mientras que el arbol se utiliza cuando quies tener los datos ordenados o buscar por rangos.
  Dependiendo de las necesidades de tu programa elegiras una de estas estructuras.

  3. Explica las diferencias entre una pila y una cola. ¿Cuándo conviene utilizar cada una de estas estructuras? ¿Cuál es el orden de comple jidad computacional de estas estructuras? No redacte el orden tal y como puede ver en los apuntes, razónelo con sus propias palabras y argumentos.

  La diferencia entre una pila y un cola es la pila se usa cuando necesitas un acceso mas rapido a los elementos mas recientes mientras que una cola se usa cuando quieres prrocesar los datos en el orden en el que llegaron. Ambas estructuras tienen una complejidad computacional constante es decir O(1).

  4. Explica el método de ordenación denominado inserción y describe las iteraciones sobre el siguiente conjunto de datos: 50 20 84 13 22 16 89 85

    Este metodo compara el segundo elemento con el primero, si el primero es mayor intercambian posiciones, luego comparara el tercer elemento con el segundo y luego con el primero y asi sucesivamente hasta que la lista este ordenada.
    Primera iteracion: compara 20 con 50, al ser 50 mayor intercambian posiciones -> 20 50 84 13 22 16 89 85
    Segunda iteracion: compara 84 con 50 y luego con 20, al ser 84 mayor la lista se queda como esta -> 20 50 84 13 22 16 89 85
    Tercera iteracion: compara 13 con 84, 50 y 20, al ser menor que todos estos se manda el 13 a la primera posicion -> 13 20 50 84 22 16 89 85
    Cuarta iteracion: compara 22 con 84, 50, 20 y 13, al ser menor que 84 y 50, y nemor que 20 y 13 el valor 22 se queda en la tercera poscion -> 13 20 22 50 84 16 89 85
    Quinta iteracion: compara 16 con 84, 50, 22, 20 y 13, al ser menor que 84, 50, 22 y 20 y mayor que 13 se queda en la segunda posicion -> 13 16 20 22 50 84 89 85
    Sesta iteracion: compara 89 con 84, 50, 22, 20, 16 y 13, al ser mayor que todos estos conserva su posicion -> 3 16 20 22 50 84 89 85
    Septima iteracion: compara 85 con 89, 84, 50, 22, 20, 16 y 13 al ser menor que 89 pero mayor que el resto intercambia posicion con este -> 3 16 20 22 50 84 85 89
    
  5. Dadas dos funciones y su número de operaciones: A = 1024n, B = 16n 3
  Calcular a partir de qué tamaño de entrada n A es más eficiente que B.

  A partir de n = 8 A sera mas eficiente que B.

# Ejercicio 3:  Dado el siguiente algoritmo recursivo:
  a) El codigo no compila, ya que se crea un bucle infinito debido a que B nunca llegua a 0.
    Para que compile la funcion recursive deberia ser asi: 
      
      public static int recursive(int a, int b) {
        if (b == 0) {
            return 1;
        } else if(b < 0) {
            return a * recursive(a, b + 1);
        }else if (a == 0) {
            return 0;
        } else {
            return a * recursive(a, b - 1);
        }

  b) La funcion recursive esta calculando A elevado a B de forma recursiva, en cada llamada se llama a A * B -1 por lo que la recursividad es de tipo lineal o directa.

# Ejercicio 4: Calcular de forma recursiva la suma de los dígitos de un número siendo un ejemplo el número 102 -> 1 + 0 + 2 = 3. Recuerde que puede realizar los cambios de tipo que crea necesarios para facilitar la resolución. ¿Qué tipo de recursividad se está empleando? ¿Qué complejidad computacional tiene el algoritmo?

  El algoritmo para calcular la suma de los digitos de un numero se encuentra en Ejercicio4/recursividad.java, se llama desde el Main.java.

  El tipo de recursividad es de tipo lineal y la complejidad del calculo computacional seria O(n) siendo n el numero ingresado.
    
     
