var tags = [];
var toggle = false;


$(function () {
    
    $('.logout-form-wrapper').hide();
    
    $('.login-form-wrapper').hide();
    $('#login').click(function () {
        $('.login-form-wrapper').slideToggle();
    });
    
    $('#logout').click(function () {
        $('.logout-form-wrapper').slideToggle();
    });
    
    $('#add-tag').click(function () {
        var titleStr = $('#tag-field').val();
        
        if(titleStr.trim() != "") {
            var tag = document.createElement('div');
            var title = document.createElement('label')
            var delButton = document.createElement('i');

            $(tag).addClass('upload-tag');
            $(title).addClass('upload-tag-title');
            $(delButton).addClass('delete-tag');
            $(delButton).addClass('fa');
            $(delButton).addClass('fa-close');

            $(delButton).click(function() {
                $(tag).remove();
            })

            $(title).html(titleStr);
            $(tag).append(title);
            $(tag).append(delButton);
            $('.upload-tag-container').append(tag)
        }
    });
    
    $("input:checkbox").on('click', function() {
        var $box = $(this);
        if ($box.is(":checked")) {
        var group = "input:checkbox[name='" + $box.attr("name") + "']";
            
        $(group).prop("checked", false);
            $box.prop("checked", true);
        } else {
            $box.prop("checked", false);
        }
    });
    
    $('.upload-container').hide();
    
    $('.add-photo').click(function() {
        $('.upload-container').fadeToggle();
        
        if(toggle) {
            $('.add-photo').rotate(0);
            toggle = false;
        } else {
            $('.add-photo').rotate(45);
            toggle = true;
        }
    });
    
})
