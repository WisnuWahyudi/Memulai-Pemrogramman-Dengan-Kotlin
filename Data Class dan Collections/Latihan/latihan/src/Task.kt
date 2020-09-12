/**
 * Untuk menyelesaikan tugas latihan, Anda tidak diperbolehkan mengubah kode yang sudah ada.
 * Cukup tambahkan kode berdasarkan perintah yang sudah ditentukan.
 *
 */
fun main() {

    // TODO 1
    val vehicle = mapOf<String, String>("Type:" to "Motorcycle","Maximal Speed:" to "230Km/s" ,
                                        "Maximal Tank:" to "10Ltr")

    // TODO 2
    val type = vehicle["Type:"]
    val maxSpeed = vehicle["Maximal Speed:"]
    val maxTank = vehicle.getValue("Maximal Tank:")

    // TODO 3
    println("Vehicle")

    vehicle.forEach { key,value -> println("$key $value") }



}