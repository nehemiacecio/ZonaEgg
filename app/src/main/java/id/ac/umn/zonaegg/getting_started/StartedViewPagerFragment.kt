package id.ac.umn.zonaegg.getting_started

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import id.ac.umn.zonaegg.R
import id.ac.umn.zonaegg.databinding.FragmentStartedViewPagerBinding

class StartedViewPagerFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        val bind = FragmentStartedViewPagerBinding.inflate(inflater, container, false)

        val listFragment: ArrayList<Fragment> = arrayListOf(
            Started1Fragment(), Started2Fragment()
        )

        val viewPagerAdapter = StartedViewPagerAdapter(
            listFragment,
            requireActivity().supportFragmentManager,
            lifecycle)

        bind.startedViewPager.adapter = viewPagerAdapter

        return bind.root
    }
}