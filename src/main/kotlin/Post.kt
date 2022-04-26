fun main() {

}

data class Post(
    var id: Long,
    var owner_id: Int = 0,
    var from_id: Int = 0,
    var created_by: Int = 0,
    var date: Int = 0,
    var text: String = "",
    var reply_owner_id: Int = 0,
    var reply_post_id: Int = 0,
    var friends_only: Boolean = true,
    var comments: Comments = Comments(),
    var copyright: Copyright = Copyright(),
    var likes: Likes = Likes(),
    var reposts: Reposts = Reposts(),
    var views: Views = Views(),
    var post_type: String = "",
    var signer_id: Int = 1,
    var can_pin: Boolean = true,
    var can_delete: Boolean = true,
    var can_edit: Boolean = true,
    var is_pinned: Boolean = true,
    var marked_as_ads: Boolean = true,
    var is_favorite: Boolean = true,
    var donut: Donut = Donut(),
    var postponed_id: Int = 0
)

data class Donut(
    var is_donut: Boolean = false,
    var paid_duration: Int = 0,
    var placeholder: Boolean = false,
    var can_publish_free_copy: Boolean = false,
    var edit_mode: String = arrayOf("all", "duration").toString()
) {

}

data class Views(
    var count: Int = 1
) {

}

data class Reposts(
    var count: Int = 0,
    var user_reposted: Boolean = true
) {

}

data class Likes(
    var count: Int = 0,
    var user_likes: Boolean = true,
    var can_like: Boolean = true,
    var can_publish: Boolean = true,
) {

}

data class Copyright(
    var id: Int = 1,
    var link: String = "",
    var name: String = "",
    var type: String = "var"
)

data class Comments(
    var count: Int = 1,
    var can_post: Boolean = true,
    var groups_can_post: Boolean = true,
    var can_close: Boolean = false,
    var can_open: Boolean = false,
) {

}