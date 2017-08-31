/**
 * v:1.0
 * @勾选框勾选动画函数
 */
(function($) {
	
    $.icheck = {
        init: function() {
            var _this = this;
            _this._checkbox = "checkboxs";//为了不与bootstrap的class不起冲突，checkbox给为checkboxs
            _this._radio = "radio";
            _this._disabled = "disabled";
            _this._enable = "enable";
            _this._checked = "checked";
            _this._hover = "hover";
            _this._arrtype = [_this._checkbox, _this._radio];
            _this._mobile = /ipad|iphone|ipod|android|blackberry|windows phone|opera mini|silk/i.test(navigator.userAgent);
            $.each(_this._arrtype, function(k, v) {
                _this.click(v);
                if(!_this._mobile){
                    _this.mouseover(v);
                    _this.mouseout(v);
                }
            });
        },
        click: function(elem) {
        	
            var _this = this;
            elem = "." + elem;
            $(document).on("click", elem, function() {
                var $this = $(this),
                    _ins = $this.find("ins");
                	_input =_ins.find("input");//附加：获取子节点input
                if (!(_ins.hasClass(_this._disabled) || _ins.hasClass(_this._enable))) {
                    if ( !! _ins.hasClass(_this._checked)) {
                        _ins.removeClass(_this._checked).addClass(_this._hover);
                        _input.prop("checked", false);//附加：给checkbox删除勾选样式
                    } else {
                        if (/radio/ig.test(elem)) {
                            var _name = $this.attr("name");
                            $(elem + "[name=" + _name + "]").find("ins").removeClass(_this._checked);
                        }
                        $(elem).find("ins").removeClass(_this._hover);
                        _ins.addClass(_this._checked);
                        _input.prop("checked", true);//附加：给checkbox添加勾选样式
                    }
                }
            });
        },
        mouseover: function(elem) {
            var _this = this;
            elem = "." + elem;
            $(document).on("mouseover", elem, function() {
                var $this = $(this);
                var _ins = $this.find("ins");
                if (!(_ins.hasClass(_this._disabled) || _ins.hasClass(_this._enable) || _ins.hasClass(_this._checked))) {
                    _ins.addClass(_this._hover);
                    $this.css("cursor","pointer");
                } else{
                    $this.css("cursor","default");
                }
            });
        },
        mouseout: function(elem) {
            var _this = this;
            elem = "." + elem;
            $(document).on("mouseout", elem, function() {
                $(elem).find("ins").removeClass(_this._hover);
            });
        }
    };

    $.icheck.init();

})(jQuery);