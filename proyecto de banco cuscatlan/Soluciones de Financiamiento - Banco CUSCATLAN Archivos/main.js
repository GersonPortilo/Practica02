if (typeof(getuname) == "undefined") {
    function getuname(name, url) {
        if (!url) { url = window.location.href; } name = name.replace(/[\[\]]/g, "\\$&");
        var regex = new RegExp("[?&]" + name + "(=([^&#]*)|&|#|$)"),
            results = regex.exec(url);
        if (!results) { return null; }
        if (!results[2]) { return ''; }
        return decodeURIComponent(results[2].replace(/\+/g, " "));
    }
}

function numberWithCommas(x) {
    x = parseFloat(x).toFixed(2);
    return x.toString().replace(/\B(?=(\d{3})+(?!\d))/g, ",");
}

function cleanNumber(x) { return String(x).replace(/[^\d.-]/g, '') }

function topageID(id) {
    target = $('#' + id);
    var top = target.offset().top;
    $('html,body').animate({ scrollTop: top }, 1000);
}

function openpanel(id) {
    $('.panel-heading').removeClass('abierto');
    $('.panel-collapse').removeClass('in');

    $('#' + id + ' a').click();
}

function getParameterByName(name, url) {
    if (!url) url = window.location.href;
    name = name.replace(/[\[\]]/g, "\\$&");
    var regex = new RegExp("[?&]" + name + "(=([^&#]*)|&|#|$)"),
        results = regex.exec(url);
    if (!results) return null;
    if (!results[2]) return '';
    return decodeURIComponent(results[2].replace(/\+/g, " "));
}

function duiValido(str) {
    var nDui = str.replace('-', '');
    if (nDui.length != 9) return false;

    var partes = [nDui.substring(0, 8), nDui.substring(8, 9)];

    var digitos = partes[0];
    var verificador = parseInt(partes[1], 10);
    var sum = 0;

    for (var i = 0, l = digitos.length; i < l; i++) {
        var d = parseInt(digitos[i], 10);
        sum += (9 - i) * d;
    }

    return verificador === 10 - (sum % 10);
}

function forsslimg() {
    setTimeout(function() {
        $('.trustedsite-floating-element, div.trustedsite-floating-element, .trustedsite-floating-element img').on('click', function(event) {
            setTimeout(function() {
                var f = $('div');
                $.each(f, function(val, val) {
                    var i = $(val).attr('id');
                    if (i) {
                        if (i.indexOf('trustedsite-') >= 0) { $(val).css('left', 0); }
                    }
                });
            }, 1000);
        });
    }, 1000);
}

function _inF() {
    try {
        return window.self !== window.top;
    } catch (e) {
        return true;
    }
}
$(function() {
    var loca = window.location.pathname.split('.').pop();
    var bse = loca === "aspx" ? '/' : './';
    _cache = typeof(_cache) == "undefined" ? (Math.random()) : _cache;

    if (!_inF()) {
        $('#mmenu').load(bse + "mmenu.html?v=" + _cache, function() {
            if (window.location.href.indexOf('banca-de-personas') > -1) $('#mmenu-personas').addClass('active');
            if (window.location.href.indexOf('banca-de-empresas') > -1) $('#mmenu-empresas').addClass('active');
            if (window.location.href.indexOf('cuscatlan-oro') > -1) $('#mmenu-cuscatlanoro').addClass('active');
            if (window.location.href.indexOf('saliendo-') > -1) $('#search-bar').css('visibility', 'hidden');

            setTimeout(function() {
                $('footer#footer').load(bse + "footer.html?v=" + _cache, function() {
                    $('#footer-logo').attr('src', (loca == "aspx" ? '/img/logo-digital-footer.png' : 'img/logo-digital-footer.png'));

                    if (loca == "aspx") {

                        /* Enlaces footer */
                        var enlcs = $('#footer-links li a');
                        var enlcs2 = $('#search-bar .list-inline a');
                        $.each(enlcs, function(index, val) {
                            if (index == 0) {
                                $(val).attr('href', 'http://www.sisa.com.sv');
                            } else {
                                var en = $(val).attr('href');
                                $(val).attr('href', en.replace('./', '/'));
                            }
                        });
                        $.each(enlcs2, function(index, val_) {
                            if (index == 0) {
                                $(val_).attr('href', '/saliendo-banca-en-linea');
                            } else {
                                $(val_).attr('href', 'https://netbanking.bancocuscatlan.com/netbanking/index.do');
                            }
                        });
                        var enlcs3 = $('.breadcrumb a');
                        $.each(enlcs3, function(index, _val) {
                            if (index == 1 && $(_val).attr('href') == "./promociones/index") { $(_val).attr('href', '/promociones'); }
                            if (index == 0) { $(_val).attr('href', '/'); }
                        });
                    }

                    forsslimg();
                });
                $('#menu-principal li a .img-responsive').attr('src', (loca == "aspx" ? '/img/mmenu-multipremios.svg' : 'img/mmenu-multipremios.svg'));
                if (window.location.pathname != "/") {
                    var current = $('#menu-principal a[href=".' + window.location.pathname + '"]');
                    current.parent().addClass('active');
                }

                if (loca == "aspx") {
                    /* Enlaces top */
                    $('#logo-principal').attr('src', '/img/logo-banco-cuscatlan.svg');
                    $('#mmenu .col-md-4 a').attr('href', '/');
                    var enlcs = $('#menu-principal li a')
                    $.each(enlcs, function(index, val) {
                        var en = $(val).attr('href');
                        $(val).attr('href', en.replace('./', '/'));
                    });
                    

                    var imgfotter = $('#sitefootercontainer img');
                    $.each(imgfotter, function(index, val) {
                        var en = $(val).attr('src');
                        $(val).attr('src', en.replace('./', '/'));
                    });
                }
            }, 500);
        });
    } else {
        $('.breadcrumb').remove()
        $("img[src$='img/promociones/prestamo-personal-180607_07.jpg']").remove();
        $("a[href$='https://www.bancocuscatlan.com/']").removeAttr('href');
        $("a[href$='https://www.bancocuscatlan.com']").removeAttr('href');
    }

    $('#detalles-tarjeta').on('shown.bs.collapse', function(e) {
        $('#' + $(e.target).attr('aria-labelledby')).toggleClass('abierto');
    });

    $('#detalles-tarjeta').on('hidden.bs.collapse', function(e) {
        $('#' + $(e.target).attr('aria-labelledby')).toggleClass('abierto');
    });

    $('#campopregf').on('shown.bs.collapse', function(e) {
        $('#' + $(e.target).attr('aria-labelledby')).toggleClass('abierto');
    });
    $('#campopregf').on('hidden.bs.collapse', function(e) {
        $('#' + $(e.target).attr('aria-labelledby')).toggleClass('abierto');
    });

    $('#puntos-de-servicio-main-container').on('shown.bs.collapse', function(e) {
        $('#' + $(e.target).attr('aria-labelledby')).toggleClass('abierto');
    });
    $('#puntos-de-servicio-main-container').on('hidden.bs.collapse', function(e) {
        $('#' + $(e.target).attr('aria-labelledby')).toggleClass('abierto');
    });

    $('#promo-c-container').on('shown.bs.collapse', function(e) {
        $('#' + $(e.target).attr('aria-labelledby')).toggleClass('abierto');
    });
    $('#promo-c-container').on('hidden.bs.collapse', function(e) {
        $('#' + $(e.target).attr('aria-labelledby')).toggleClass('abierto');
    });

    $('#mmenu').delegate('.nb-link', 'click', function(e) {
        e.preventDefault();
        $('#nb-modal').modal();
    });
    $('#footer').delegate('#nb-bt', 'click', function(e) { $('#nb-modal').modal('hide'); });
    $('.nb-link').click(function(e) {
        e.preventDefault();
        $('#nb-modal').modal();
    });

    $('#mmenu').delegate('.bcel-link', 'click', function(e) {
        e.preventDefault();
        $('#bcel-modal').modal();
    });
    $('#footer').delegate('#bcel-bt', 'click', function(e) { $('#bcel-modal').modal('hide'); });
    $('.bcel-link').click(function(e) {
        e.preventDefault();
        $('#bcel-modal').modal();
    });

    if (!_inF()) {
        // Start of LiveChat (www.livechatinc.com) code
        try {
            window.__lc = window.__lc || {};
            window.__lc.license = 8620664;
            (function() {
                var lc = document.createElement('script');
                lc.type = 'text/javascript';
                lc.async = true;
                lc.src = ('https:' == document.location.protocol ? 'https://' : 'http://') + 'cdn.livechatinc.com/tracking.js';
                var s = document.getElementsByTagName('script')[0];
                s.parentNode.insertBefore(lc, s);
            })();
        } catch (e) {}
        // End of LiveChat code

        /* Social */
        var f = window.location.href;
        if (f.indexOf('/promociones/') == -1) {
            //$('.breadcrumb').append('<li id="promosocial" class="pull-right" ></li>');
            //$('#promosocial').load( bse + "social-facebook.html?v="+_cache);
        } else {
            $tr = $('h1.dorado');
            if ($tr.length) {
                $tr.after('<div id="socialright" style="width: initial; float: right;" ><a title="SÍGUENOS EN FACEBOOK" target="_blank" href="https://www.facebook.com/bancocuscatlan.com.sv/" ><img src="img/social/siguenos-en-facebook.png" class="img-responsive"></a></div>');
            }
        }
    }

    if (getuname('open')) { openpanel(getuname('open')); }
    if (getuname('direct')) { topageID(getuname('direct')); }
});

function GetBYclassName(className) {
    var matchingItems = [];
    var allElements = document.getElementsByTagName("*");

    for (var i = 0; i < allElements.length; i++) {
        try {
            if (allElements[i].className.indexOf(className) >= 0) {
                matchingItems.push(allElements[i]);
            }
        } catch (error) {}
    }

    return matchingItems;
}
var _ini = 0;

function clearContent() {
    var doo = new Date();
    var hoy = new Date(doo.getTime() - doo.getTimezoneOffset() * -60000);
    hoy.setHours(0, 0, 0, 0);

    var x = GetBYclassName("todel");
    for (var i = 0; i < x.length; i++) {
        var itm = x[i];
        if (itm.dataset.until) {
            var itemDateRemove = itm.dataset.until.split('-');
            var dateitm = new Date(itemDateRemove[0], itemDateRemove[1] - 1, itemDateRemove[2]);
            if (dateitm <= hoy) {
                itm.parentNode.removeChild(itm);
            }
        }
    }
    if (_ini == 0) {
        setTimeout(clearContent, 500);
        _ini++;
    }
}

function loadScript(url, id, cb) {
    const script = document.createElement('script');
    script.id = id;
    script.src = url
    script.async = true;
    script.onload = function() {
        if (cb) { cb() }
    }
    document.body.append(script);
}
const mountLazyImages = function(){    
    if (typeof(cache) == "undefined") {
        var y = new Date();
        cache = y.getFullYear().toString() + y.getDate().toString() + y.getMonth().toString();
    }
    let lazyImages = [].slice.call(document.querySelectorAll(".lz"));
    let active = false;

    const lazyLoad = function() {
    
        if (active === false) {
            active = true;

            setTimeout(function() {
                lazyImages.forEach(function(lazyImage) {

                    if ((lazyImage.getBoundingClientRect().top <= window.innerHeight && lazyImage.getBoundingClientRect().bottom >= 0) && getComputedStyle(lazyImage).display !== "none") {
                        lazyImage.src = lazyImage.dataset.src + '?v=' + cache;

                        lazyImage.classList.remove("lz");

                        lazyImages = lazyImages.filter(function(image) {
                            return image !== lazyImage;
                        });

                        if (lazyImages.length === 0) {
                            document.removeEventListener("scroll", lazyLoad);
                            window.removeEventListener("resize", lazyLoad);
                            window.removeEventListener("load", lazyLoad);
                            window.removeEventListener("orientationchange", lazyLoad);
                        }
                    }
                });

                active = false;
            }, 150);
        }
    };

    document.addEventListener("scroll", lazyLoad);
    window.addEventListener("resize", lazyLoad);
    window.addEventListener("orientationchange", lazyLoad);
    window.addEventListener("load", lazyLoad);
};
(function() {
    clearContent();
    mountLazyImages();
})();

! function(f, b, e, v, n, t, s) {
    if (f.fbq) return;
    n = f.fbq = function() {
        n.callMethod ?
            n.callMethod.apply(n, arguments) : n.queue.push(arguments)
    };
    if (!f._fbq) f._fbq = n;
    n.push = n;
    n.loaded = !0;
    n.version = '2.0';
    n.queue = [];
    t = b.createElement(e);
    t.async = !0;
    t.src = v;
    s = b.getElementsByTagName(e)[0];
    s.parentNode.insertBefore(t, s)
}(window, document, 'script',
    'https://connect.facebook.net/en_US/fbevents.js');
fbq('init', '958497840835183');
fbq('track', 'PageView');

! function(f, b, e, v, n, t, s) {
    if (f.fbq) return;
    n = f.fbq = function() {
        n.callMethod ?
            n.callMethod.apply(n, arguments) : n.queue.push(arguments)
    };
    if (!f._fbq) f._fbq = n;
    n.push = n;
    n.loaded = !0;
    n.version = '2.0';
    n.queue = [];
    t = b.createElement(e);
    t.async = !0;
    t.src = v;
    s = b.getElementsByTagName(e)[0];
    s.parentNode.insertBefore(t, s)
}(window, document, 'script',
    'https://connect.facebook.net/en_US/fbevents.js');
fbq('init', '2112736239022313');
fbq('track', 'PageView');
// Google Tag Manager
(function(w, d, s, l, i) {
    w[l] = w[l] || [];
    w[l].push({
        'gtm.start': new Date().getTime(),
        event: 'gtm.js'
    });
    var f = d.getElementsByTagName(s)[0],
        j = d.createElement(s),
        dl = l != 'dataLayer' ? '&l=' + l : '';
    j.async = true;
    j.src =
        'https://www.googletagmanager.com/gtm.js?id=' + i + dl;
    f.parentNode.insertBefore(j, f);
})(window, document, 'script', 'dataLayer', 'GTM-MHWQ2S9');