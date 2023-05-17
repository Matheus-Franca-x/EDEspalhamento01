package model;

import java.util.Objects;

public class Num {

	public int num;

	public Num(int num)
	{
		this.num = num;
	}
	
	@Override
	public String toString() {
		return "Num [num=" + num + ", posit=" + num % 300 + "]";
	}

	@Override
	public int hashCode() {
		int posicao = num % 300;
		return posicao;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Num other = (Num) obj;
		return num == other.num;
	}
	
	

}
