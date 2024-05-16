var tl = gsap.timeline()
tl.from(".nav-1 img,.nav-2 h3,.nav-3 h4,.nav-3 button",{
    y:-100,
    duration:1,
    delay:.4,
    opcity:0,
    stagger:0.2
})
tl.from("h1",{
    y:100,
    opacity:0,
    stagger:0.3
});
tl.from(".container>img",{
    opacity:0,
    scale:0,
    stagger:0.3
});
tl.from("h5",{
    opacity:0,
    scale:0
});
tl.to("h5",{
    yoyo:true,
    y:30,
    duration:0.8,
    repeat:-1
})