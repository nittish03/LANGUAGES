import qrcode
myqr = qrcode.make("https://www.google.com/maps/@28.7395447,77.1139979,15z?authuser=0&entry=ttu&g_ep=EgoyMDI0MDgyOC4wIKXMDSoASAFQAw%3D%3D")
myqr.save("nothing.png")