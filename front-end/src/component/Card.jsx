import React from 'react'

function Card({value}) {
  return (
    <>
    <div className="col-lg-4">
<div className="card border-danger border-4 " style={{width: '18rem'}}>
  <img src="https://images.unsplash.com/photo-1505740420928-5e560c06d30e?q=80&w=1000&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8M3x8cHJvZHVjdHxlbnwwfHwwfHx8MA%3D%3D" className="card-img-top" alt="..." />
  <div className="card-body">
    <h5 className="card-title">Card title</h5>
    <p className="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
    <div className="progress bg-black" role="progressbar" aria-label="Success example" aria-valuenow={25} aria-valuemin={0} aria-valuemax={100}>
  <div className="progress-bar bg-success" style={{width: `${value}%`}} />
</div>

  </div>
</div>
</div>
    </>
  )
}

export default Card
