package com.github.rhodolfo.ode

private[ode] trait Euler {

  import com.github.rhodolfo.ode.Aux.{Real,RealWithOps,ArrWithOps}

  def solveEulerScalar(t: Real, dt: Real, uOld: Real, source: (Real, Real) => Real): (Real, Real) = {
    (uOld + source(uOld, t)*dt, dt)
  }

  def solveEuler(t: Real, dt: Real, uOld: Seq[Real], source: (Seq[Real], Real) => Seq[Real]): (Seq[Real], Real) = {
    (uOld + source(uOld, t)*dt, dt)
  }

}
