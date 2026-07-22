import office from "./office.jpg";

function App() {

  const officeList = [

    {
      Name: "DBS",
      Rent: 50000,
      Address: "Chennai"
    },

    {
      Name: "Regus",
      Rent: 75000,
      Address: "Bangalore"
    },

    {
      Name: "WeWork",
      Rent: 45000,
      Address: "Hyderabad"
    },

    {
      Name: "Awfis",
      Rent: 85000,
      Address: "Delhi"
    }

  ];

  return (

    <div className="App">

      <h1>Office Space, at Affordable Range</h1>

      {
        officeList.map((officeItem, index) => (

          <div key={index} className="card">

            <img
              src={office}
              alt="Office Space"
              width="250"
              height="200"
            />

            <h2>Name: {officeItem.Name}</h2>

            <h3
              style={{
                color:
                  officeItem.Rent <= 60000
                    ? "red"
                    : "green"
              }}
            >
              Rent Rs. {officeItem.Rent}
            </h3>

            <h3>Address: {officeItem.Address}</h3>

            <hr />

          </div>

        ))
      }

    </div>

  );
}

export default App;