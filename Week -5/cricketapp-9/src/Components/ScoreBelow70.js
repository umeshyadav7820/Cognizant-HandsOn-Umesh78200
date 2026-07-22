function ScoreBelow70(props) {

  const players70 = props.players.filter(
    (item) => item.score < 70
  );

  return (

    <div>

      {

        players70.map((item, index) => (

          <li key={index}>
            Mr. {item.name} {item.score}
          </li>

        ))

      }

    </div>

  );

}

export default ScoreBelow70;