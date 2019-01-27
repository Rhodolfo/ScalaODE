package com.github.rhodolfo.ode

object Aux {

  type Real = Double

  implicit class ArrWithOps(seq: Seq[Real]) {
    def +(other: Seq[Real]): Seq[Real] = (seq zip other).map(_ match {
      case (a,b) => a+b
    })
    def -(other: Seq[Real]): Seq[Real] = (seq zip other).map(_ match {
      case (a,b) => a-b
    })
    def *(real: Real): Seq[Real] = seq.map(a => a*real)
    def /(real: Real): Seq[Real] = seq.map(a => a/real)
  }

  implicit class RealWithOps(x: Real) {
    def *(seq: Seq[Real]): Seq[Real] = seq.map(a => x*a)
    def /(seq: Seq[Real]): Seq[Real] = seq.map(a => x/a)
  }

}
