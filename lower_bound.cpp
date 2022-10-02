int lower_bound(vector<int>& a, int target)
{
        int l = 0, r = a.size() - 1;
        if(a[0] >= target)
        {
            return 0;
        }
        if(a[r] < target)
        {
            return a.size();
        }
        while(r > l + 1)
        {
            int mid = (l + r) / 2;
            if(a[mid] >= target)
            {
                r = mid;
            }
            else
            {
                l = mid;
            }
        }
        return r;
    }
