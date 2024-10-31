// var tl = gsap.timeline()
// tl.from(".nav-1 img,.nav-2 h3,.nav-3 h4,.nav-3 button",{
//     y:-100,
//     duration:1,
//     delay:.4,
//     opcity:0,
//     stagger:0.2
// })
// tl.from("h1",{
//     y:100,
//     opacity:0,
//     stagger:0.3
// });
// tl.from(".container>img",{
//     opacity:0,
//     scale:0,
//     stagger:0.3
// });
// tl.from("h5",{
//     opacity:0,
//     scale:0
// });
// tl.to("h5",{
//     yoyo:true,
//     y:30,
//     duration:0.8,
//     repeat:-1
// })


const myPromise = new Promise((resolve, reject) =>{
    setTimeout(()=> {
        resolve("Hello, world!");
    } , 5000);
});

// async function test1() {
//     const res = await myPromise;
//     console.log(res);
//     console.log("resolved");
// }
// test1();
function test2() {
    const res = myPromise.then( res1 => console.log(res1));
    console.log(res);
    console.log("resolved");
}
test2();
