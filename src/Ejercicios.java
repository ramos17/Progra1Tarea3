public class Ejercicios
{
	//devuelve la suma de x y y
	static int sumar(int x, int y)
	{
		int suma = x + y;
		return suma;
	}
	
	//devuelve la resta de x y y
	static int restar(int x, int y)
	{
		int resta = x - y;
		return resta;
	}
	//devuelve la multiplicacion de x y y
	static int multiplicar(int x, int y)
	{
		int mul = x * y;
		return mul;
	}
	
	//devuelve el residuo de x y y
	static int residuo(int x, int y)
	{
		int div = x % y;
		return div;
		
	}
	
	//devuelve true si x es par, de lo cotrario devuelve false
	static boolean esPar(int x) 
	{
		return x % 2 == 0;
	}
	
	//devuelve true si x es multiplo de 3, de lo cotrario devuelve false
	static boolean esMultiploDe3(int x)
	{
		return x % 3 == 0;
	}
	
	//devuelve el numero mayor (x o y)
	static int getMayor(int x,int y)
	{
		if (x > y)
			return x;
		else
				return y;
	}
	
	//devuelve true si la edad es mayor o igual a 18
	static boolean esMayorDeEdad(int edad)
	{
		return edad>=18;
	}
	
	//devuelve true si x, y y z son pares
	static boolean sonPares(int x, int y, int z)
	{
		{
			if( (x%2) ==0 && (y%2) ==0 && (z%2) ==0)
			{
				return true;
			}
			return false;

		}
	}
	
	//devuelve el numero mayor entre x, y y z
	static int getMayorDe3(int x, int y, int z)
	{
		if (x >y && x>z){
			return x;
		}
		
		if (y>x && y>z){
			return y;
		}else{
			return z;
		}
	}
	
	public static void main(String[] args)
	{
		
	}

}
