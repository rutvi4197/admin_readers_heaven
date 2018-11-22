// Dashboard 1 Morris-chart


Morris.Area({
        element: 'extra-area-chart',
        data: [{
                    period: '2012',
                    Bags: 0,
                    Shoes: 0
                }, {
                    period: '2013',
                    Bags: 50,
                    Shoes: 15
                }, {
                    period: '2014',
                    Bags: 20,
                    Shoes: 50
                }, {
                    period: '2015',
                    Bags: 60,
                    Shoes: 12
                }, {
                    period: '2016',
                    Bags: 30,
                    Shoes: 20
                }, {
                    period: '2017',
                    Bags: 25,
                    Shoes: 80
                }, {
                    period: '2018',
                    Bags: 10,
                    Shoes: 10
                }


                ],
                lineColors: ['#f75b36', '#00b5c2'],
                xkey: 'period',
                ykeys: ['Bags', 'Shoes'],
                labels: ['Bag', 'Shoes'],
                pointSize: 0,
                lineWidth: 0,
                resize:true,
                fillOpacity: 0.8,
                behaveLikeLine: true,
                gridLineColor: '#e0e0e0',
                hideHover: 'auto'
        
    });
