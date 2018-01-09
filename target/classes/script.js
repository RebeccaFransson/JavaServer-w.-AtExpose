window.onload = () => {
    document.getElementsByTagName('button')[0].addEventListener('click', () => {
        const a = document.getElementById('a').value
        const b = document.getElementById('b').value
        new Promise(async (resolve, reject) => {
            const res = await fetch('call/add?a='+a+'&b='+b)
            const json = await res.json()
            resolve(json)
        })
    .then((response) => {
        const content = document.createTextNode(response);
        document.getElementById('answer').appendChild(content);
    })
    })
}
