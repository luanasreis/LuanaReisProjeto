package com.br.fabsolutionsw.luanareis;


import com.br.fabsolutionsw.luanareis.ValoresITF;

public class Valores implements ValoresITF {

	int[] valor = new int[10];

	@Override
	public boolean ins(int v) {
		// Insere um valor
		if (v > 0 && size() == 0) {
			this.valor[0] = v;
			return true;
		} else if (v > 0 && size() > 0 && size()<10) {
			this.valor[size()] = v;
			return true;
		}

		return false;

	}

	@Override
	public int del(int indice) {
		// Remove o valor armazenado no indice i e retorna o valor removido
		if ((indice < 0) || (indice > 9)) {
			return -1;
		}
		
		if (size()==0) {
			return -1;
		}
		
		int v;
		int x=0;
		int[] novo = new int[10];
		
		v = this.valor[indice];
		this.valor[indice] = 0;

        for (int i = 0; i < this.valor.length; i++) {
        	if (this.valor[i]>0) {
        		novo[x] = this.valor[i];
        		x++;
        	}
        }
        
        this.valor = novo;
		
		return v;
	}

	@Override
	public int size() {

		int tam=0;
		
		for (int i = 0; i < this.valor.length; i++) {
			if (this.valor[i]>0) {
				tam++;
			}
		}
		
		return tam;
	}

	@Override
	public double mean() {
		// Retorna a média dos valores armazenados
		if (size()==0) {
			return -1;
		}
		
		int total = 0;

		for (int i = 0; i < this.valor.length; i++) {
			if (this.valor[i]>0) {
				total += this.valor[i];
			}
		}

		return total / size();
	}

	@Override
	public int greater() {
		// retorna o maior valor armazenado
		if (size()==0) {
			return -1;
		}
		
		int max = this.valor[0];
		
		for (int i = 0; i < this.valor.length; i++) {
			if (this.valor[i] > max) {
				max = this.valor[i];
			}
		}
		return max;
	}

	@Override
	public int lower() {
		
		if (size()==0) {
			return -1;
		}
		
		// retorna o maior valor armazenado
		int min = this.valor[0];
		for (int i = 0; i < this.valor.length; i++) {
			if (this.valor[i] < min) {
				min = this.valor[i];
			}
		}
		return min;
	}

}