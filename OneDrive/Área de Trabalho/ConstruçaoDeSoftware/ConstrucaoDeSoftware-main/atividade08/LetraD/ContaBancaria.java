package LetraD;

import java.util.Scanner;
    public class ContaBancaria {
        private double saldo;

        public ContaBancaria(double saldoInicial) {
            this.saldo += saldoInicial;
        }

        public void depositar (double valor) {
            this.saldo += valor;
        }
            public void sacar ( double valor) throws SaldoInsuficienteExcepcion {
                if (valor > saldo) {
                    throw new SaldoInsuficienteExcepcion ("Saldo insuficiente");
                }


                this.saldo -= valor;
            }
                public double getSaldo () {
                    return saldo;
                }
            }
