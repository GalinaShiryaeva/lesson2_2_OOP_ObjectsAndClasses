object WallService {
    private var posts = emptyArray<Post>()

    fun add(post: Post): Post {
        posts += post
        post.id++
        return post
    }

    fun update(post: Post): Boolean {
        for (post. in posts) {

            }
        }
    }
}

/*
        owner_id: Int,
        friends_only: Boolean,
        from_group: Boolean,
        message: String,
        // attachments
        servises: String,
        signed: Boolean,
        publish_date: Int,
        // lat: Double,
        // long: Double,
        // place_id: Int,
        post_id: Int,
        // guid: String,
        mark_as_ads: Boolean,
        close_comments: Boolean,
        donut_paid_duration: Int,
        mute_notifications: Boolean,
        copyright: String,
        topic_id: Int
*/