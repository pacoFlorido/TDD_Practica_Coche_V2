package testing;

public class Coche {

	public int velocidad;

	public void acelerar_PacoFloridoQuesada(int aceleracion) {
		velocidad += aceleracion;
	}

	public void decelerar_PacoFloridoQuesada(int deceleracion) {
		velocidad -= deceleracion;
		if (velocidad<0) velocidad = 0;
	}
}
