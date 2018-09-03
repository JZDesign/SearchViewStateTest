package com.example.jacobrakidzich.searchviewstatetest

import android.content.Context
import android.graphics.Canvas
import android.graphics.Rect
import android.support.v4.content.ContextCompat.getColor
import android.util.AttributeSet
import android.widget.SearchView

// example of how to inject this item to a view.
//<com.everydollar.android.ui.BarChart
// .......
// />
class SearchActivity: SearchView {
    constructor(context: Context) :
            super(context)

    constructor(context: Context, attrs: AttributeSet?) :
            super(context, attrs)

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) :
            super(context, attrs, defStyleAttr)

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
    }

    override fun onFinishInflate() {
        super.onFinishInflate()
        val searchView = this.rootView as SearchView
        searchView.resources.getColorStateList(R.drawable.color_state_list)
//        searchView.resources.at
//        searchView.resources.newTheme()
    }

    override fun onFocusChanged(gainFocus: Boolean, direction: Int, previouslyFocusedRect: Rect?) {
        super.onFocusChanged(gainFocus, direction, previouslyFocusedRect)
        if (gainFocus) {
            this.setBackgroundColor(context.getColor(R.color.black))

        } else {
            this.setBackgroundColor(context.getColor(R.color.red))

        }
    }
}