fun main() {
    var id: Long = 0

    // заполняем массив
    for (i in 0..5) {
        WallService.add(Post(++id))
    }

    WallService.update(Post(5))

    WallService.printPosts()
}